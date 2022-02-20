# D&D Companion

Helps you play D&D

Sam's Notes:
> Saving/Loading works, kinda. Right now characters are automatically saved to the "ExampleChars" folder, with their name as the filename. There is a test character that loads in when you run CharacterSheet that you can save  by pressing Save Character in the File dropdown menu, and then load by navigating to ExampleChars and double-clicking on "Terry.char". Obviously very barebones, but it was just a test for me to make sure I had the code right. Definitely could be cleaner, but it works for now so I'm happy with it. Will eventually make a function to update the labels and things on CharacterSheet, but I have a few that are there just to confirm that Load Character is working.

> I have some ideas for the CharacterEditor and how it'll play with the Character class, I'm gonna draw up an idea and send it to you

> TestChars Nick/Louie/Sam/Philomena show what the toString() method looks like for Subraces of other races (displays subrace in the Race section), Humans (displays ethnicity in place of subrace), Dragonborn (displays ancestry in place of subrace), and regular races (does not show anything extra) respectively.

> Alignment is now Strings istead of ints. Enums and ints were dumb ideas.

Nick's Notes:
> I need to remove a few items from the editor since they're now in the Race/Class classes. 

> We should be able to start save/load and setting up the menu items once we have subraces set up.

> Wrote up the Load action for the Editor but I think it'll have to change with how the toString is setup rn. What I wrote assumes that an object can be pull out of the .char file but that's not what happens. ...Double-checked and I was right, it doesn't work with the DNDChar toString. It might work with default toString I'll do some more testing for that.