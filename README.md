# Spotbugs Demo
This is a demo project to illustrate how to use PMD for static code analysis in Java projects. PMD scans Java source code and detects potential issues like unused variables, empty catch blocks, and more.
## Getting started
Prerequisites
* Java Development Kit (JDK) 8 or higher
* Apache Maven

## Installation
Clone the repository:
``git clone https://github.com/Taapke/pmd-demo``
``cd pmd-demo``

``mvn compile``
``mvn pmd:check``

## Usage
After running the commands, PMD will analyze the code and generate a report. The results can be found in the target directory file pmd.xml or pmd.html.

## Configuration
PMD can be configured by modifying the pom.xml file. You can specify the ruleset and the format of the report according to your needs.