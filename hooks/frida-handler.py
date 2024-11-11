#python code
import frida
import time
import sys

ScriptFile=sys.argv[1]

def my_message_handler(message, payload):
    print("[+] Message: {}".format(message))
    print("[+] Payload: {}".format(payload))

    if payload is not None:
    	print("[+] Payload (Hex): {}".format(payload.hex()))

device = frida.get_usb_device()
pid = device.spawn(["com.mtni.myirancell"])
device.resume(pid)
time.sleep(1)  # Without it Java.perform silently fails
session = device.attach(pid)
with open(ScriptFile) as f:
    script = session.create_script(f.read())
script.on("message", my_message_handler)
script.load()




input()