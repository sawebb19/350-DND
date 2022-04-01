# D&D Companion

Helps you play D&D

Sam's Notes:
> Saving/Loading works, kinda. Right now characters are automatically saved to the "ExampleChars" folder, with their name as the filename. There is a test character that loads in when you run CharacterSheet that you can save  by pressing Save Character in the File dropdown menu, and then load by navigating to ExampleChars and double-clicking on "Terry.char". Obviously very barebones, but it was just a test for me to make sure I had the code right. Definitely could be cleaner, but it works for now so I'm happy with it. Will eventually make a function to update the labels and things on CharacterSheet, but I have a few that are there just to confirm that Load Character is working.

> I have some ideas for the CharacterEditor and how it'll play with the Character class, I'm gonna draw up an idea and send it to you

> TestChars Nick/Louie/Sam/Philomena show what the toString() method looks like for Subraces of other races (displays subrace in the Race section), Humans (displays ethnicity in place of subrace), Dragonborn (displays ancestry in place of subrace), and regular races (does not show anything extra) respectively.

> Alignment is now Strings istead of ints. Enums and ints were dumb ideas.

Nick's Notes:
> Subraces now work through constructors in their respective race class (including humans and dragonborn). Next is subclasses in the same way.

> I also did some work with the file choosing system for opening a saving a file. Streamlined to open/save in the ExampleChars folder.

> I created an App class to later streamline starting the program. Having a centralized main method allows for later jarring. The mains for the Gui classes are still there for testing but I plan to remove them before release

> Classes with subclasses implemented: Barbarian, Fighter, Rogue