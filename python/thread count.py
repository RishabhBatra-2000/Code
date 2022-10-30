# Code to execute in an independent thread
import time
import threading 

def countdown(n,f):
	while n > 0:
		print('T-minus', n,f)
		n -= 1
		time.sleep(1)
		print('active threads',f)
		print(threading.active_count())
		
# Creating and launching the threads
t = threading.Thread(target = countdown, args =(10, 't thread'))
t.start()
f = threading.Thread(target = countdown,args = (5, 'f thread'))
f.start()
