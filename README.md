# D&D Companion

Helps you play D&D

Sam's Notes:
> Saving/Loading works, kinda. Right now characters are automatically saved to the "ExampleChars" folder, with their name as the filename. There is a test character that loads in when you run CharacterSheet that you can save  by pressing Save Character in the File dropdown menu, and then load by navigating to ExampleChars and double-clicking on "Terry.char". Obviously very barebones, but it was just a test for me to make sure I had the code right. Definitely could be cleaner (StackOverflow question that fixes some SonarLint warning I'm getting: https://stackoverflow.com/questions/71017635/use-try-with-resources-or-close-this-stream-ini-a-finally-clause), but it works for now so I'm happy with it.

> I have some ideas for the CharacterEditor and how it'll play with the Character class, I'm gonna draw up an idea and send it to you

> TestChars Nick/Louie/Sam/Philomena show what the toString() method looks like for Subraces of other races (displays subrace in the Race section), Humans (displays ethnicity in place of subrace), Dragonborn (displays ancestry in place of subrace), and regular races (does not show anything extra) respectively.

> May change Ethical/Moral alignment to Enums instead of ints. Ints aren't descriptive. Can do Strings too I guess, but I kinda wanna do enums

Nick's Notes:
> I need to remove a few items from the editor since they're now in the Race/Class classes. 

> We should be able to start save/load and setting up the menu items once we have subraces set up.