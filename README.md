# intellij-ron
[![Marketplace](https://img.shields.io/static/v1?label=&message=Marketplace&labelColor=FFF&color=000&logo=intellij-idea&logoColor=000)](https://plugins.jetbrains.com/plugin/14897-ron/)

A plugin that adds RON (Rusty Object Notation) support to IntelliJ IDEA

## Versions
1.4 - Updated to support 2020.3 edition of Intellij IDEs

1.3 - Adds support for block comments and cleaned up some code

1.2 - Adds context menu option for creating RON files

1.1 - Fixes issues with recognizing types, and allows raw strings to work properly

1.0 - Allows underscores in identifiers and extensions, and fixed maps and lists

1.0-SNAPSHOT - Initial release, very buggy, but adds basic support for highlighting RON files

## Contributing
If there is a specific feature you want to see, or an issue with the plugin, make an issue, and I'll try to get back to it.
If you want to add a feature or resolve an issue, first let me know by replying to a feature request or issue report, and then make a pull request.


## Building
Requires Intellij IDEA, Gradle CLI and the plugins Grammar-Kit, PsiViewer, and Plugin DevKit.

To build, run the command `gradle buildPlugin`, and the zipped plugin will be generated in build/distributions

## License
intellij-ron is dual-licensed under Apache-2 and MIT.