# Doujin Folder Formatter - Java
Formats folders downloaded by Hentoid but in Java
## Why in Java?
I wanted to try renaming by reading JSON file instead of by initial folder name. I tried doing it in Python, but I ran into some issues with some Unicode characters. 
## Requirements
- JDK 1.8
- JRE 1.8
## How to use
1. Place the JAR file in a directory
2. Add a input folder in the said directory.
3. Place all doujins/hentoid downloads in the input folder
4. Run the JAR file.
5. Output will be in the output folder.
## Features
- Basically the same as the [python](https://github.com/Requiem97/Doujin-Folder-Formatter) version; however, it gets the folder name based on the contentV2.json file.
- Only supports 3 sources at the moment: Fakku, nhentai, and Hentaicafe.
