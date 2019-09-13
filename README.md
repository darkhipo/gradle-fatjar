# Gradle FatJar
This project is meant to set up a minimal scaffolding for building a fatJar using gradle. The `build.gradle` file is the main contribution, in it we set up some minimal tasks for linting, building and testing our code. 

The project emits a FatJar jar file in the `build/libs` directory, that jar can be used to execute the code directly from the specified entry point, or it can be imported as a library in other code. 

## Installation
```
sudo apt install --yes openjdk-8-jdk gradle         &&
git clone git@github.com:darkhipo/gradle-fatjar.git &&
cd gradle-fatjar                                     ;
```

## Usage
This command will run all the tasks listed in `build.gradle` and produce a fatjar in the `build/libs` directory.
```
gradle --rerun-tasks clean lint build test
```
