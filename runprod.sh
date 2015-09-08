#!/bin/bash

# compile java
javac \
    -sourcepath $JAVA_UTIL_DIRECTORY/src \
    -d $JAVA_UTIL_DIRECTORY/class \
    src/com/kirkkt/java/util/*.java

# cd class

# run prod
# java \
    # -cp $JAVA_CLASS_PATH \
    # com/kirkkt/java/tax/ProdRunner

# cd ..
