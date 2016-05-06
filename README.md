# weird-abs

```
$ sudo update-alternatives --config java
There are 2 choices for the alternative java (providing /usr/bin/java).

  Selection    Path                                            Priority   Status
  ------------------------------------------------------------
    0            /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java   1071      auto mode
    * 1            /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java   1071      manual mode
      2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1069      manual mode

      Press <enter> to keep the current choice[*], or type selection number: 1
      $ lein run
      10000000000000 10000000000000
      $ sudo update-alternatives --config java
      There are 2 choices for the alternative java (providing /usr/bin/java).

        Selection    Path                                            Priority   Status
        ------------------------------------------------------------
          0            /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java   1071      auto mode
          * 1            /usr/lib/jvm/java-7-openjdk-amd64/jre/bin/java   1071      manual mode
            2            /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java   1069      manual mode

            Press <enter> to keep the current choice[*], or type selection number: 2
            update-alternatives: using /usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java to provide /usr/bin/java (java) in manual mode
            $ lein run
            10000000000000 1316134912
```

## License

Copyright © 2016 Gregor Stocks

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
