# D&D Companion

Helps you play D&D

Sam's Notes:
> Stat.java seemed unnecessary. We can just bake stats and modifiers into each race/class. Will need to take some time to figure out how to do that cleanly, but I think I have a good starting point. Will eventually add setters and getters for everything.

> Die.java also seems unnecessary, although I suppose it may make certain interactions look cleaner. We can probably just use java.util.Random.nextInt(int bound) when we need to roll a die.

> I'm getting errors that the package name doesn't match the expected string "". I know package names have to do with the folder structure, but not much more than that. It seems like we shouldn't be getting that error, but I'll look further into it.

> Apparently the convention for package names is camelCase, rather than PascalCase. It's only a warning, but I think it's in our best interest to change it at some point. dndCompanion works just as well. The only thing is that I don't think we can/should use d&d because the ampersand might make for some weird problems down the road.

> Will eventually make a Subrace.java to deal with the modifiers for the subraces of elves, dwarves, etc.