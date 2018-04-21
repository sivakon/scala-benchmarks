# sbt-jmh-example

Example project for sbt-jmh, sbt plugin for JMH (Java Microbenchmark Harness).
Project is just a vanilla Scala project to let you modify the code and hit the ground running with sbt-jmh.

"Trust no one, bench everything." - <http://kto.so>
Plugin located at <https://github.com/ktoso/sbt-jmh>

Benchmark code taken directly from <http://chariotsolutions.com/blog/post/microbenchmarking-scala-with-jmh/>

Requirements:

*JDK
*SBT

```
# To run benchmark, call jhm:run from the sbt console in the project directory (root dir of this repo)
sbt
jmh:run -i 20 -wi 10 -f1 -t1
# close sbt console with 'exit'
```

Please see sources above for full explanation of flags and usage.

## Dotty

```
info] # Run complete. Total time: 00:01:02
[info]
[info] Benchmark                   Mode  Cnt    Score     Error   Units
[info] TestHexString.format       thrpt   20   44.266 ±   0.988  ops/ms
[info] TestHexString.stringManip  thrpt   20  814.319 ± 113.869  ops/ms
```
TODO: Fix `TestHexString.interpolation` for dotty. Change `scalaVersion` in `build.sbt` for running benchmarks.

## Scala 2.12.4
```
[info] Benchmark                     Mode  Cnt     Score    Error   Units
[info] TestHexString.format         thrpt   20    45.713 ±  0.954  ops/ms
[info] TestHexString.interpolation  thrpt   20    43.802 ±  1.308  ops/ms
[info] TestHexString.stringManip    thrpt   20  1285.862 ± 63.489  ops/ms
```