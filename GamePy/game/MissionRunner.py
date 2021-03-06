'''
Created on May 1, 2014
'''

class MissionRunner(object):
    '''
    This will be the brains of our game to begin with
    We will make a simple mission-based game. The user just selects things to do
    from menus
    '''
    shouldKeepRunning = True;

    def __init__(self):
        '''
        Constructor
        '''
        
    def run(self):
        while self.shouldKeepRunning:
            self.showMenuDialog()
            choice = input()
            self.handleInput(choice)
            
    def showMenuDialog(self):
        # Escaping the character 'n' (\n) means "new line character" which puts
        # the text that follows it on a different line
        print("\nWelcome to the game!\n")
        print("Please select what you would like to do:")
        print(" (1) Say hello")
        print(" (2) Have me say hello")
        # Please add more items to this menu. You may notice it is a bit
        # cumbersome to do add and handle the menu items this way, so we will
        # be refactoring it in the near future.
        # ------- Begin Additions
        # ------- End Additions
        print(" (Q) Quit this endless game")
        
    def handleInput(self, choice):
        if choice == "1":
            # In order to display a quote ("), we need to escape the character
            # with a backslash (\) to tell the compiler that the next quote
            # does not end the string, but instead is acually part of the string
            print("You say, \"Hello\"")
        elif choice == "2":
            print("Please tell me your name so that I may address you properly.");
            # This next line concatenates (combines) the hard-coded string
            # "Hello, " with anything the user enters. Because the method
            # getUserInput() returns a String, we do not need to store the
            # result in a temporary variable
            print("Hello, " + input())
        elif choice == "Q":
            print("Thanks for playing!  Goodbye!")
            # We definitely need a way to stop this, so this is it!
            self.shouldKeepRunning = False
        else:
            # This is called error handling - the user may input something
            # wrong, so we handle that here.
            print("I'm sorry, but I think you've made a mistake.\nI do not understand '"
                    + choice + "' so please select something from the list.")
