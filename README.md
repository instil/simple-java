# Overview

This is a very simple project which provides a gradle build script with configured static analysis tools.

The project contains a number of bugs and style issues which need resolved.

# Tasks
1. Clone the git repository
```
git clone git@github.com:instil/simple-java.git
```

2. Attempt to build project and repeat this command after each of the next steps
```
./gradlew build
```

3. Search maven repository for google guava version 19.0
```
open http://search.maven.org/
```

4. Add missing guava dependency to build.gradle by replacing.
```
    //Add Guava dependency here
```
with
```
    compile 'com.google.guava:guava:19.0'
```

5. Fix check style issue in Adder by replacing:
```
// Insert copyright here
```
with
```
/*
 * Copyright 2015 Instil.
 */
```

6. Fix Findbugs issue in Adder by replacing:
```
// Fix equals to use object equality rather than reference equality
return value1 == value2;
```
With
```
return value1.equals(value2);
```

7. Fix PMD issue in AdderTest by replacing:
```
// Insert statement here so we don't have an empty block
```
with
```
System.out.println("NullPointer successfully thrown");
```
