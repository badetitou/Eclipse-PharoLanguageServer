| server |

Transcript crShow: 'Run with Eclipse'.

PLSServer reset.
server := PLSServer new
		withStdIO: true;
		debugMode: true;
		yourself.
		
server start.