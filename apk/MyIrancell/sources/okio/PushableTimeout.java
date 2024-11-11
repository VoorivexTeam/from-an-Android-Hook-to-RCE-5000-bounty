package okio;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
final class PushableTimeout extends Timeout {
    private long originalDeadlineNanoTime;
    private boolean originalHasDeadline;
    private long originalTimeoutNanos;
    private Timeout pushed;

    /* JADX INFO: Access modifiers changed from: package-private */
    public void pop() {
        this.pushed.timeout(this.originalTimeoutNanos, TimeUnit.NANOSECONDS);
        if (this.originalHasDeadline) {
            this.pushed.deadlineNanoTime(this.originalDeadlineNanoTime);
        } else {
            this.pushed.clearDeadline();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void push(Timeout timeout) {
        long deadlineNanoTime;
        this.pushed = timeout;
        boolean hasDeadline = timeout.hasDeadline();
        this.originalHasDeadline = hasDeadline;
        this.originalDeadlineNanoTime = hasDeadline ? timeout.deadlineNanoTime() : -1L;
        long timeoutNanos = timeout.timeoutNanos();
        this.originalTimeoutNanos = timeoutNanos;
        timeout.timeout(Timeout.minTimeout(timeoutNanos, timeoutNanos()), TimeUnit.NANOSECONDS);
        if (this.originalHasDeadline && hasDeadline()) {
            deadlineNanoTime = Math.min(deadlineNanoTime(), this.originalDeadlineNanoTime);
        } else if (!hasDeadline()) {
            return;
        } else {
            deadlineNanoTime = deadlineNanoTime();
        }
        timeout.deadlineNanoTime(deadlineNanoTime);
    }
}
