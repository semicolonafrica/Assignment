import sys,subprocess
file_object = open('ayo.py','w+')
subprocess.run('Akinlolu',shell=True, stdout=file_object)
print('Akinlolu',file=file_object)
print('Olaoluwaposi',file=sys.stdout)
print('Olaoluwaposi',file=file_object)
print('Awoseemo',file=sys.stdout)
print('Awoseemo',file=file_object)