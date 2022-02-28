# D&D Companion

Helps you play D&D

Sam's Notes:
> Saving/Loading works, kinda. Right now characters are automatically saved to the "ExampleChars" folder, with their name as the filename. There is a test character that loads in when you run CharacterSheet that you can save  by pressing Save Character in the File dropdown menu, and then load by navigating to ExampleChars and double-clicking on "Terry.char". Obviously very barebones, but it was just a test for me to make sure I had the code right. Definitely could be cleaner, but it works for now so I'm happy with it. Will eventually make a function to update the labels and things on CharacterSheet, but I have a few that are there just to confirm that Load Character is working.

> I have some ideas for the CharacterEditor and how it'll play with the Character class, I'm gonna draw up an idea and send it to you

> TestChars Nick/Louie/Sam/Philomena show what the toString() method looks like for Subraces of other races (displays subrace in the Race section), Humans (displays ethnicity in place of subrace), Dragonborn (displays ancestry in place of subrace), and regular races (does not show anything extra) respectively.

> Alignment is now Strings istead of ints. Enums and ints were dumb ideas.

Nick's Notes:
> Character Sheet and Editor are how they will be barring minor changes to location of a few components. Nothing funciton will change.

> You can switch back and forth between GUIs with the window menu. 

> We'll need to do code coverage on everything but the guis basically. That's a job for tomorrow night.