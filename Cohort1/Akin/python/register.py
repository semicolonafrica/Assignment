from time import ctime as current_time
## This is the input prompt to the user

##List of help commands
HELP_COMMANDS = ['help','h']

##List of edn program commands
QUIT_COMMANDS = ['q','quit']

CUSTOMER_NAME = PRODUCT_NAME = TIME_OF_PURCHASE = QTY = TOTAL_COST = PRICE = None
## Command to show
SHOW_COMMAND = 'showlogs'
#
IS_RUNNING = True
def trim(var):
    return var.strip()

def getInput():
    global IS_RUNNING
    try:
        ## collect info from user and assigns to respective vars
        
        prompt = 'Type info here:'

        ## collect info from user and assigns to respective user
        info = input(prompt)


        if info.lower() in HELP_COMMANDS:
            displayHelpMessage()
            return False, None

        if info.lower() in QUIT_COMMANDS:

            IS_RUNNING = False
            return True, None

        if info.lower() == SHOW_COMMAND:
            showLogs()
            return False, None

        info = info.split(',')

        if len(info) != 4:
            displayErrorMessage()
            return False,None
        
        return True, info
    
    except Exception as e:
        displayErrorMessage()
        return False,None



def displayErrorMessage():
    print('Invalid Input!!!\n')

def displayHelpMessage():
    print('Here are the working command')
    print('-----------------------------')
    print(' showLogs: to see all registered information')
    print('help: to see help message')
    print('Type in Customer Name,Product Name,Quantity, Price separated by commas to register' )
    print()

def getInputFromUser():

    status = False
    while status == False:
      status, info =  getInput()
    return info

def showLogs():
    if QTY is None:
        print('Empty Logs!')
    else:
        print('{:20s} {:15s} {:^10s} {:^10s} {:^10s} {:^10s}'.format('Customer\'s Name', 'Product Name', 'QTY', 'PRICE',
                                                                     'Total Cost', 'Time'))
        print('{:20s} {:15s} {:^10.2f} {:^10.2f} {:^10.2f} {:^s}'.format(CUSTOMER_NAME, PRODUCT_NAME, QTY, PRICE, TOTAL_COST, TIME_OF_PURCHASE))

def main():
    global CUSTOMER_NAME, PRODUCT_NAME, QTY, PRICE,TOTAL_COST,TIME_OF_PURCHASE
    displayHelpMessage()

    ##Collect the necessary input
    while True:
    ##get all values
        info = getInputFromUser()

        if IS_RUNNING == False:
            print('Program is shutting down...')
            print('Program shut down Successfully')
            break
    ##trim var spaces
        CUSTOMER_NAME,PRODUCT_NAME, QTY, PRICE = list(map(trim,info))

        PRICE = float(PRICE)
        QTY = float(QTY)
        TOTAL_COST = PRICE * QTY

    ## time of purchase
        TIME_OF_PURCHASE = current_time()

        # print('{:20s} {:15s} {:^10s} {:^10s} {:^10s} {:^10s}'.format('Customer\'s Name', 'Product Name', 'QTY', 'PRICE', 'Total Cost','Time'))
        ##print('{:20s} {:15s} {:^10.2f} {:^10.2f} {:^10.2f} {:^s}'.format(CUSTOMER_NAME,PRODUCT_NAME, QTY, PRICE, TOTAL_COST,TIME_OF_PURCHASE))

if __name__ == '__main__':
    main()