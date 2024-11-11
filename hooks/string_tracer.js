Java.perform(function() {
  ['java.lang.StringBuilder', 'java.lang.StringBuffer'].forEach(function(clazz, i) {
    console.log('[?] ' + i + ' = ' + clazz);
    var func = 'toString';
    Java.use(clazz)[func].implementation = function() {
      var ret = this[func]();

      // print stacktrace if return value contains specific string
		
      Java.perform(function() {
      var jAndroidLog = Java.use("android.util.Log"), jException = Java.use("java.lang.Exception");
		  console.log("=======Start============")
      console.log( jAndroidLog.getStackTraceString( jException.$new() ) );
		  console.log("=======<String>============")
		  console.log(ret)
		  console.log("=======</String>============")
		  console.log("=======End============")
      }); 
		
      send('[' + i + '] ' + ret);
      return ret;
    }   
  }); 
});