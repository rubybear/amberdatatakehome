## AmberData Take home

### To run the assignment follow these steps
```bash
git clone https://github.com/rubybear/amberdatatakehome.git
cd amberdatatakehome
docker run --rm -it $(docker build -q .)
```

### SBT will execute the unit tests and run the project
<details>
<summary>Click to expand log output</summary>
  <pre style="white-space: pre-wrap;">
[info] ProcessedWordsTest:
[info] - create should return Some(ProcessedWords) for valid input
[info] - create should return None for input with empty keys after trimming
[info] - create should trim keys in mapOfWords
[info] WordsTest:
[info] - toProcessedWords should correctly process words with mixed lengths
[info] - toProcessedWords should handle empty string
[info] - characterCount should return correct count for a word
[info] - characterCount should handle empty word
[info] Run completed in 346 milliseconds.
[info] Total number of tests run: 7
[info] Suites: completed 2, aborted 0
[info] Tests: succeeded 7, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 12 s, completed Sep 10, 2024, 8:09:46 AM
[info] running com.example.AmberDataWordProcessor
08:09:46.876 [sbt-bg-threads-1] INFO com.example.AmberDataWordProcessor$ -- AmberDataWordProcessor
08:09:47.003 [sbt-bg-threads-1] INFO com.example.Words -- Word: Consectetur, Character count: 11
08:09:47.004 [sbt-bg-threads-1] INFO com.example.Words -- Word: Consectetur, with odd character count: 11
08:09:47.004 [sbt-bg-threads-1] INFO com.example.Words -- Word: anim, Character count: 4
08:09:47.005 [sbt-bg-threads-1] INFO com.example.Words -- Word: exercitation, Character count: 12
08:09:47.005 [sbt-bg-threads-1] INFO com.example.Words -- Word: voluptate, Character count: 9
08:09:47.005 [sbt-bg-threads-1] INFO com.example.Words -- Word: voluptate, with odd character count: 9
08:09:47.005 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, Character count: 5
08:09:47.005 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, with odd character count: 5
08:09:47.006 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.006 [sbt-bg-threads-1] INFO com.example.Words -- Word: nostrud, Character count: 7
08:09:47.006 [sbt-bg-threads-1] INFO com.example.Words -- Word: nostrud, with odd character count: 7
08:09:47.006 [sbt-bg-threads-1] INFO com.example.Words -- Word: Et, Character count: 2
08:09:47.007 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.007 [sbt-bg-threads-1] INFO com.example.Words -- Word: eu, Character count: 2
08:09:47.007 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.007 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.008 [sbt-bg-threads-1] INFO com.example.Words -- Word: quis, Character count: 4
08:09:47.008 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, Character count: 5
08:09:47.008 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, with odd character count: 5
08:09:47.008 [sbt-bg-threads-1] INFO com.example.Words -- Word: laborum, Character count: 7
08:09:47.008 [sbt-bg-threads-1] INFO com.example.Words -- Word: laborum, with odd character count: 7
08:09:47.009 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, Character count: 7
08:09:47.009 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, with odd character count: 7
08:09:47.009 [sbt-bg-threads-1] INFO com.example.Words -- Word: ad, Character count: 2
08:09:47.009 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, Character count: 3
08:09:47.009 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, with odd character count: 3
08:09:47.010 [sbt-bg-threads-1] INFO com.example.Words -- Word: enim, Character count: 4
08:09:47.010 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, Character count: 5
08:09:47.010 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, with odd character count: 5
08:09:47.010 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.010 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, Character count: 5
08:09:47.010 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, with odd character count: 5
08:09:47.011 [sbt-bg-threads-1] INFO com.example.Words -- Word: esse, Character count: 4
08:09:47.011 [sbt-bg-threads-1] INFO com.example.Words -- Word: Eu, Character count: 2
08:09:47.011 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.011 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.011 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, Character count: 5
08:09:47.012 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, with odd character count: 5
08:09:47.012 [sbt-bg-threads-1] INFO com.example.Words -- Word: ea, Character count: 2
08:09:47.012 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.012 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.012 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, Character count: 13
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, with odd character count: 13
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, Character count: 3
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, with odd character count: 3
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: anim, Character count: 4
08:09:47.013 [sbt-bg-threads-1] INFO com.example.Words -- Word: duis, Character count: 4
08:09:47.014 [sbt-bg-threads-1] INFO com.example.Words -- Word: quis, Character count: 4
08:09:47.014 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, Character count: 7
08:09:47.014 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, with odd character count: 7
08:09:47.014 [sbt-bg-threads-1] INFO com.example.Words -- Word: Nisi, Character count: 4
08:09:47.014 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: ex, Character count: 2
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: occaecat, Character count: 8
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, Character count: 3
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, with odd character count: 3
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: eiusmod, Character count: 7
08:09:47.015 [sbt-bg-threads-1] INFO com.example.Words -- Word: eiusmod, with odd character count: 7
08:09:47.016 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, Character count: 11
08:09:47.016 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, with odd character count: 11
08:09:47.016 [sbt-bg-threads-1] INFO com.example.Words -- Word: in, Character count: 2
08:09:47.017 [sbt-bg-threads-1] INFO com.example.Words -- Word: nostrud, Character count: 7
08:09:47.017 [sbt-bg-threads-1] INFO com.example.Words -- Word: nostrud, with odd character count: 7
08:09:47.017 [sbt-bg-threads-1] INFO com.example.Words -- Word: deserunt, Character count: 8
08:09:47.053 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (est,3)
08:09:47.054 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (sit,3)
08:09:47.054 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ipsum,5)
08:09:47.054 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Lorem,5)
08:09:47.055 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (magna,5)
08:09:47.055 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (nulla,5)
08:09:47.055 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (nostrud,7)
08:09:47.055 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (laborum,7)
08:09:47.056 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ullamco,7)
08:09:47.056 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (eiusmod,7)
08:09:47.056 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (voluptate,9)
08:09:47.056 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (consectetur,11)
08:09:47.056 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Consectetur,11)
08:09:47.057 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (reprehenderit,13)
08:09:47.058 [sbt-bg-threads-1] INFO com.example.Words -- Word: Mollit, Character count: 6
08:09:47.058 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.058 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, Character count: 11
08:09:47.059 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, with odd character count: 11
08:09:47.059 [sbt-bg-threads-1] INFO com.example.Words -- Word: fugiat, Character count: 6
08:09:47.059 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.059 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.059 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.060 [sbt-bg-threads-1] INFO com.example.Words -- Word: Aliquip, Character count: 7
08:09:47.060 [sbt-bg-threads-1] INFO com.example.Words -- Word: Aliquip, with odd character count: 7
08:09:47.060 [sbt-bg-threads-1] INFO com.example.Words -- Word: laborum, Character count: 7
08:09:47.060 [sbt-bg-threads-1] INFO com.example.Words -- Word: laborum, with odd character count: 7
08:09:47.060 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, Character count: 3
08:09:47.061 [sbt-bg-threads-1] INFO com.example.Words -- Word: sit, with odd character count: 3
08:09:47.061 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, Character count: 7
08:09:47.061 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, with odd character count: 7
08:09:47.061 [sbt-bg-threads-1] INFO com.example.Words -- Word: cillum, Character count: 6
08:09:47.061 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.061 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.062 [sbt-bg-threads-1] INFO com.example.Words -- Word: ut, Character count: 2
08:09:47.062 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, Character count: 7
08:09:47.062 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, with odd character count: 7
08:09:47.062 [sbt-bg-threads-1] INFO com.example.Words -- Word: cupidatat, Character count: 9
08:09:47.062 [sbt-bg-threads-1] INFO com.example.Words -- Word: cupidatat, with odd character count: 9
08:09:47.063 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.063 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.063 [sbt-bg-threads-1] INFO com.example.Words -- Word: commodo, Character count: 7
08:09:47.063 [sbt-bg-threads-1] INFO com.example.Words -- Word: commodo, with odd character count: 7
08:09:47.063 [sbt-bg-threads-1] INFO com.example.Words -- Word: Est, Character count: 3
08:09:47.063 [sbt-bg-threads-1] INFO com.example.Words -- Word: Est, with odd character count: 3
08:09:47.064 [sbt-bg-threads-1] INFO com.example.Words -- Word: amet, Character count: 4
08:09:47.064 [sbt-bg-threads-1] INFO com.example.Words -- Word: irure, Character count: 5
08:09:47.064 [sbt-bg-threads-1] INFO com.example.Words -- Word: irure, with odd character count: 5
08:09:47.064 [sbt-bg-threads-1] INFO com.example.Words -- Word: elit, Character count: 4
08:09:47.064 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.064 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.065 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (est,3)
08:09:47.065 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (sit,3)
08:09:47.065 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Est,3)
08:09:47.066 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (minim,5)
08:09:47.066 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ipsum,5)
08:09:47.066 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (velit,5)
08:09:47.066 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (irure,5)
08:09:47.066 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (commodo,7)
08:09:47.067 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Aliquip,7)
08:09:47.067 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (aliquip,7)
08:09:47.067 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ullamco,7)
08:09:47.068 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (laborum,7)
08:09:47.068 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (cupidatat,9)
08:09:47.068 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (adipisicing,11)
08:09:47.068 [sbt-bg-threads-1] INFO com.example.Words -- Word: Sint, Character count: 4
08:09:47.068 [sbt-bg-threads-1] INFO com.example.Words -- Word: nostrud, Character count: 7
08:09:47.069 [sbt-bg-threads-1] INFO com.example.Words -- Word: nostrud, with odd character count: 7
08:09:47.069 [sbt-bg-threads-1] INFO com.example.Words -- Word: eiusmod, Character count: 7
08:09:47.069 [sbt-bg-threads-1] INFO com.example.Words -- Word: eiusmod, with odd character count: 7
08:09:47.069 [sbt-bg-threads-1] INFO com.example.Words -- Word: fugiat, Character count: 6
08:09:47.070 [sbt-bg-threads-1] INFO com.example.Words -- Word: elit, Character count: 4
08:09:47.070 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.070 [sbt-bg-threads-1] INFO com.example.Words -- Word: Amet, Character count: 4
08:09:47.070 [sbt-bg-threads-1] INFO com.example.Words -- Word: eu, Character count: 2
08:09:47.070 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.071 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, Character count: 7
08:09:47.071 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, with odd character count: 7
08:09:47.071 [sbt-bg-threads-1] INFO com.example.Words -- Word: tempor, Character count: 6
08:09:47.071 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, Character count: 9
08:09:47.071 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, with odd character count: 9
08:09:47.072 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, Character count: 13
08:09:47.072 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, with odd character count: 13
08:09:47.072 [sbt-bg-threads-1] INFO com.example.Words -- Word: cillum, Character count: 6
08:09:47.072 [sbt-bg-threads-1] INFO com.example.Words -- Word: quis, Character count: 4
08:09:47.072 [sbt-bg-threads-1] INFO com.example.Words -- Word: Minim, Character count: 5
08:09:47.073 [sbt-bg-threads-1] INFO com.example.Words -- Word: Minim, with odd character count: 5
08:09:47.073 [sbt-bg-threads-1] INFO com.example.Words -- Word: in, Character count: 2
08:09:47.073 [sbt-bg-threads-1] INFO com.example.Words -- Word: fugiat, Character count: 6
08:09:47.073 [sbt-bg-threads-1] INFO com.example.Words -- Word: eiusmod, Character count: 7
08:09:47.073 [sbt-bg-threads-1] INFO com.example.Words -- Word: eiusmod, with odd character count: 7
08:09:47.073 [sbt-bg-threads-1] INFO com.example.Words -- Word: nisi, Character count: 4
08:09:47.074 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.074 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.074 [sbt-bg-threads-1] INFO com.example.Words -- Word: duis, Character count: 4
08:09:47.074 [sbt-bg-threads-1] INFO com.example.Words -- Word: labore, Character count: 6
08:09:47.074 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, Character count: 9
08:09:47.074 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, with odd character count: 9
08:09:47.075 [sbt-bg-threads-1] INFO com.example.Words -- Word: pariatur, Character count: 8
08:09:47.075 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.075 [sbt-bg-threads-1] INFO com.example.Words -- Word: labore, Character count: 6
08:09:47.075 [sbt-bg-threads-1] INFO com.example.Words -- Word: Pariatur, Character count: 8
08:09:47.075 [sbt-bg-threads-1] INFO com.example.Words -- Word: anim, Character count: 4
08:09:47.076 [sbt-bg-threads-1] INFO com.example.Words -- Word: nisi, Character count: 4
08:09:47.076 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, Character count: 9
08:09:47.076 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, with odd character count: 9
08:09:47.076 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.076 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.077 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.077 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.077 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.077 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.077 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, Character count: 7
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, with odd character count: 7
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: commodo, Character count: 7
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: commodo, with odd character count: 7
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: nisi, Character count: 4
08:09:47.078 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, Character count: 7
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, with odd character count: 7
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: Aliquip, Character count: 7
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: Aliquip, with odd character count: 7
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: duis, Character count: 4
08:09:47.079 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, Character count: 11
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, with odd character count: 11
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: esse, Character count: 4
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: enim, Character count: 4
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: Cupidatat, Character count: 9
08:09:47.080 [sbt-bg-threads-1] INFO com.example.Words -- Word: Cupidatat, with odd character count: 9
08:09:47.081 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.081 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.081 [sbt-bg-threads-1] INFO com.example.Words -- Word: commodo, Character count: 7
08:09:47.081 [sbt-bg-threads-1] INFO com.example.Words -- Word: commodo, with odd character count: 7
08:09:47.081 [sbt-bg-threads-1] INFO com.example.Words -- Word: ad, Character count: 2
08:09:47.081 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.082 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, Character count: 5
08:09:47.082 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, with odd character count: 5
08:09:47.082 [sbt-bg-threads-1] INFO com.example.Words -- Word: non, Character count: 3
08:09:47.082 [sbt-bg-threads-1] INFO com.example.Words -- Word: non, with odd character count: 3
08:09:47.082 [sbt-bg-threads-1] INFO com.example.Words -- Word: ut, Character count: 2
08:09:47.082 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: ex, Character count: 2
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: ex, Character count: 2
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: pariatur, Character count: 8
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, Character count: 11
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, with odd character count: 11
08:09:47.083 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.084 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.084 [sbt-bg-threads-1] INFO com.example.Words -- Word: occaecat, Character count: 8
08:09:47.086 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (est,3)
08:09:47.086 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (non,3)
08:09:47.086 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (minim,5)
08:09:47.086 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ipsum,5)
08:09:47.087 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (magna,5)
08:09:47.087 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (velit,5)
08:09:47.087 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (nulla,5)
08:09:47.087 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Minim,5)
08:09:47.087 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (nostrud,7)
08:09:47.087 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (commodo,7)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Aliquip,7)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (aliquip,7)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ullamco,7)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (officia,7)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (eiusmod,7)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (excepteur,9)
08:09:47.088 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Cupidatat,9)
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (consectetur,11)
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (adipisicing,11)
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (reprehenderit,13)
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Word: Ex, Character count: 2
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Word: non, Character count: 3
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Word: non, with odd character count: 3
08:09:47.089 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.090 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.090 [sbt-bg-threads-1] INFO com.example.Words -- Word: duis, Character count: 4
08:09:47.090 [sbt-bg-threads-1] INFO com.example.Words -- Word: voluptate, Character count: 9
08:09:47.090 [sbt-bg-threads-1] INFO com.example.Words -- Word: voluptate, with odd character count: 9
08:09:47.090 [sbt-bg-threads-1] INFO com.example.Words -- Word: dolor, Character count: 5
08:09:47.090 [sbt-bg-threads-1] INFO com.example.Words -- Word: dolor, with odd character count: 5
08:09:47.091 [sbt-bg-threads-1] INFO com.example.Words -- Word: labore, Character count: 6
08:09:47.091 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.091 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.091 [sbt-bg-threads-1] INFO com.example.Words -- Word: labore, Character count: 6
08:09:47.091 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, Character count: 7
08:09:47.092 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, with odd character count: 7
08:09:47.092 [sbt-bg-threads-1] INFO com.example.Words -- Word: Eiusmod, Character count: 7
08:09:47.092 [sbt-bg-threads-1] INFO com.example.Words -- Word: Eiusmod, with odd character count: 7
08:09:47.092 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, Character count: 7
08:09:47.092 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, with odd character count: 7
08:09:47.092 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, Character count: 5
08:09:47.093 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, with odd character count: 5
08:09:47.093 [sbt-bg-threads-1] INFO com.example.Words -- Word: sint, Character count: 4
08:09:47.093 [sbt-bg-threads-1] INFO com.example.Words -- Word: cupidatat, Character count: 9
08:09:47.093 [sbt-bg-threads-1] INFO com.example.Words -- Word: cupidatat, with odd character count: 9
08:09:47.093 [sbt-bg-threads-1] INFO com.example.Words -- Word: Pariatur, Character count: 8
08:09:47.094 [sbt-bg-threads-1] INFO com.example.Words -- Word: ex, Character count: 2
08:09:47.094 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.094 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.094 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.094 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.094 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, Character count: 5
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, with odd character count: 5
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: sunt, Character count: 4
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: Nostrud, Character count: 7
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: Nostrud, with odd character count: 7
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: esse, Character count: 4
08:09:47.095 [sbt-bg-threads-1] INFO com.example.Words -- Word: non, Character count: 3
08:09:47.096 [sbt-bg-threads-1] INFO com.example.Words -- Word: non, with odd character count: 3
08:09:47.096 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, Character count: 3
08:09:47.096 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, with odd character count: 3
08:09:47.096 [sbt-bg-threads-1] INFO com.example.Words -- Word: voluptate, Character count: 9
08:09:47.096 [sbt-bg-threads-1] INFO com.example.Words -- Word: voluptate, with odd character count: 9
08:09:47.097 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.097 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.097 [sbt-bg-threads-1] INFO com.example.Words -- Word: pariatur, Character count: 8
08:09:47.098 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, Character count: 13
08:09:47.098 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, with odd character count: 13
08:09:47.098 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, Character count: 7
08:09:47.099 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, with odd character count: 7
08:09:47.099 [sbt-bg-threads-1] INFO com.example.Words -- Word: esse, Character count: 4
08:09:47.099 [sbt-bg-threads-1] INFO com.example.Words -- Word: irure, Character count: 5
08:09:47.099 [sbt-bg-threads-1] INFO com.example.Words -- Word: irure, with odd character count: 5
08:09:47.099 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.100 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.100 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.100 [sbt-bg-threads-1] INFO com.example.Words -- Word: Cupidatat, Character count: 9
08:09:47.100 [sbt-bg-threads-1] INFO com.example.Words -- Word: Cupidatat, with odd character count: 9
08:09:47.100 [sbt-bg-threads-1] INFO com.example.Words -- Word: eu, Character count: 2
08:09:47.101 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.101 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.101 [sbt-bg-threads-1] INFO com.example.Words -- Word: in, Character count: 2
08:09:47.101 [sbt-bg-threads-1] INFO com.example.Words -- Word: ad, Character count: 2
08:09:47.101 [sbt-bg-threads-1] INFO com.example.Words -- Word: irure, Character count: 5
08:09:47.101 [sbt-bg-threads-1] INFO com.example.Words -- Word: irure, with odd character count: 5
08:09:47.102 [sbt-bg-threads-1] INFO com.example.Words -- Word: do, Character count: 2
08:09:47.102 [sbt-bg-threads-1] INFO com.example.Words -- Word: duis, Character count: 4
08:09:47.102 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.102 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.102 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.102 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.103 [sbt-bg-threads-1] INFO com.example.Words -- Word: Sit, Character count: 3
08:09:47.103 [sbt-bg-threads-1] INFO com.example.Words -- Word: Sit, with odd character count: 3
08:09:47.103 [sbt-bg-threads-1] INFO com.example.Words -- Word: ut, Character count: 2
08:09:47.103 [sbt-bg-threads-1] INFO com.example.Words -- Word: laborum, Character count: 7
08:09:47.103 [sbt-bg-threads-1] INFO com.example.Words -- Word: laborum, with odd character count: 7
08:09:47.103 [sbt-bg-threads-1] INFO com.example.Words -- Word: veniam, Character count: 6
08:09:47.104 [sbt-bg-threads-1] INFO com.example.Words -- Word: sint, Character count: 4
08:09:47.104 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, Character count: 7
08:09:47.104 [sbt-bg-threads-1] INFO com.example.Words -- Word: ullamco, with odd character count: 7
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (est,3)
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (qui,3)
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Sit,3)
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (non,3)
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (minim,5)
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (dolor,5)
08:09:47.106 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (culpa,5)
08:09:47.107 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (velit,5)
08:09:47.107 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (nulla,5)
08:09:47.107 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (irure,5)
08:09:47.107 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Eiusmod,7)
08:09:47.107 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (officia,7)
08:09:47.107 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (laborum,7)
08:09:47.108 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Nostrud,7)
08:09:47.108 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ullamco,7)
08:09:47.108 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (cupidatat,9)
08:09:47.109 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (voluptate,9)
08:09:47.109 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Cupidatat,9)
08:09:47.110 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (reprehenderit,13)
08:09:47.110 [sbt-bg-threads-1] INFO com.example.Words -- Word: Esse, Character count: 4
08:09:47.110 [sbt-bg-threads-1] INFO com.example.Words -- Word: esse, Character count: 4
08:09:47.111 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.111 [sbt-bg-threads-1] INFO com.example.Words -- Word: labore, Character count: 6
08:09:47.111 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, Character count: 7
08:09:47.111 [sbt-bg-threads-1] INFO com.example.Words -- Word: officia, with odd character count: 7
08:09:47.111 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliqua, Character count: 6
08:09:47.112 [sbt-bg-threads-1] INFO com.example.Words -- Word: sunt, Character count: 4
08:09:47.112 [sbt-bg-threads-1] INFO com.example.Words -- Word: veniam, Character count: 6
08:09:47.112 [sbt-bg-threads-1] INFO com.example.Words -- Word: exercitation, Character count: 12
08:09:47.113 [sbt-bg-threads-1] INFO com.example.Words -- Word: Velit, Character count: 5
08:09:47.113 [sbt-bg-threads-1] INFO com.example.Words -- Word: Velit, with odd character count: 5
08:09:47.113 [sbt-bg-threads-1] INFO com.example.Words -- Word: dolore, Character count: 6
08:09:47.113 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.114 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.114 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.114 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.114 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.114 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.114 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.115 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.115 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, Character count: 5
08:09:47.115 [sbt-bg-threads-1] INFO com.example.Words -- Word: nulla, with odd character count: 5
08:09:47.116 [sbt-bg-threads-1] INFO com.example.Words -- Word: dolore, Character count: 6
08:09:47.116 [sbt-bg-threads-1] INFO com.example.Words -- Word: cillum, Character count: 6
08:09:47.116 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, Character count: 13
08:09:47.116 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, with odd character count: 13
08:09:47.117 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.117 [sbt-bg-threads-1] INFO com.example.Words -- Word: Est, Character count: 3
08:09:47.117 [sbt-bg-threads-1] INFO com.example.Words -- Word: Est, with odd character count: 3
08:09:47.117 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, Character count: 3
08:09:47.117 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, with odd character count: 3
08:09:47.118 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.118 [sbt-bg-threads-1] INFO com.example.Words -- Word: exercitation, Character count: 12
08:09:47.118 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.118 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.118 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.118 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.119 [sbt-bg-threads-1] INFO com.example.Words -- Word: consequat, Character count: 9
08:09:47.119 [sbt-bg-threads-1] INFO com.example.Words -- Word: consequat, with odd character count: 9
08:09:47.119 [sbt-bg-threads-1] INFO com.example.Words -- Word: ea, Character count: 2
08:09:47.119 [sbt-bg-threads-1] INFO com.example.Words -- Word: amet, Character count: 4
08:09:47.120 [sbt-bg-threads-1] INFO com.example.Words -- Word: Consectetur, Character count: 11
08:09:47.120 [sbt-bg-threads-1] INFO com.example.Words -- Word: Consectetur, with odd character count: 11
08:09:47.120 [sbt-bg-threads-1] INFO com.example.Words -- Word: aute, Character count: 4
08:09:47.121 [sbt-bg-threads-1] INFO com.example.Words -- Word: cillum, Character count: 6
08:09:47.121 [sbt-bg-threads-1] INFO com.example.Words -- Word: deserunt, Character count: 8
08:09:47.121 [sbt-bg-threads-1] INFO com.example.Words -- Word: tempor, Character count: 6
08:09:47.121 [sbt-bg-threads-1] INFO com.example.Words -- Word: amet, Character count: 4
08:09:47.121 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, Character count: 11
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, with odd character count: 11
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: esse, Character count: 4
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: exercitation, Character count: 12
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: consequat, Character count: 9
08:09:47.122 [sbt-bg-threads-1] INFO com.example.Words -- Word: consequat, with odd character count: 9
08:09:47.123 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, Character count: 5
08:09:47.123 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, with odd character count: 5
08:09:47.124 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (qui,3)
08:09:47.124 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Est,3)
08:09:47.124 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (est,3)
08:09:47.124 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (minim,5)
08:09:47.124 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ipsum,5)
08:09:47.124 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Lorem,5)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Velit,5)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (nulla,5)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (officia,7)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (consequat,9)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Consectetur,11)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (adipisicing,11)
08:09:47.125 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (reprehenderit,13)
08:09:47.126 [sbt-bg-threads-1] INFO com.example.Words -- Word: Veniam, Character count: 6
08:09:47.126 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, Character count: 5
08:09:47.126 [sbt-bg-threads-1] INFO com.example.Words -- Word: magna, with odd character count: 5
08:09:47.126 [sbt-bg-threads-1] INFO com.example.Words -- Word: laboris, Character count: 7
08:09:47.126 [sbt-bg-threads-1] INFO com.example.Words -- Word: laboris, with odd character count: 7
08:09:47.126 [sbt-bg-threads-1] INFO com.example.Words -- Word: ea, Character count: 2
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, Character count: 3
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, with odd character count: 3
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: quis, Character count: 4
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, Character count: 7
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, with odd character count: 7
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: pariatur, Character count: 8
08:09:47.127 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, Character count: 5
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, with odd character count: 5
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, Character count: 5
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: culpa, with odd character count: 5
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.128 [sbt-bg-threads-1] INFO com.example.Words -- Word: et, Character count: 2
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: Ex, Character count: 2
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: tempor, Character count: 6
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, Character count: 3
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, with odd character count: 3
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: deserunt, Character count: 8
08:09:47.129 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, Character count: 11
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: adipisicing, with odd character count: 11
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, Character count: 7
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: aliquip, with odd character count: 7
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, Character count: 5
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: minim, with odd character count: 5
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: quis, Character count: 4
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: in, Character count: 2
08:09:47.130 [sbt-bg-threads-1] INFO com.example.Words -- Word: ex, Character count: 2
08:09:47.131 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.131 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.131 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, Character count: 3
08:09:47.131 [sbt-bg-threads-1] INFO com.example.Words -- Word: est, with odd character count: 3
08:09:47.131 [sbt-bg-threads-1] INFO com.example.Words -- Word: cillum, Character count: 6
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: proident, Character count: 8
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: Sit, Character count: 3
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: Sit, with odd character count: 3
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.132 [sbt-bg-threads-1] INFO com.example.Words -- Word: sint, Character count: 4
08:09:47.133 [sbt-bg-threads-1] INFO com.example.Words -- Word: do, Character count: 2
08:09:47.133 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, Character count: 11
08:09:47.133 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, with odd character count: 11
08:09:47.133 [sbt-bg-threads-1] INFO com.example.Words -- Word: Irure, Character count: 5
08:09:47.133 [sbt-bg-threads-1] INFO com.example.Words -- Word: Irure, with odd character count: 5
08:09:47.134 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, Character count: 5
08:09:47.134 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, with odd character count: 5
08:09:47.134 [sbt-bg-threads-1] INFO com.example.Words -- Word: mollit, Character count: 6
08:09:47.134 [sbt-bg-threads-1] INFO com.example.Words -- Word: in, Character count: 2
08:09:47.134 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, Character count: 5
08:09:47.134 [sbt-bg-threads-1] INFO com.example.Words -- Word: velit, with odd character count: 5
08:09:47.135 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, Character count: 9
08:09:47.135 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, with odd character count: 9
08:09:47.135 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, Character count: 3
08:09:47.135 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, with odd character count: 3
08:09:47.135 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, Character count: 5
08:09:47.136 [sbt-bg-threads-1] INFO com.example.Words -- Word: ipsum, with odd character count: 5
08:09:47.136 [sbt-bg-threads-1] INFO com.example.Words -- Word: Sunt, Character count: 4
08:09:47.136 [sbt-bg-threads-1] INFO com.example.Words -- Word: occaecat, Character count: 8
08:09:47.136 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, Character count: 3
08:09:47.137 [sbt-bg-threads-1] INFO com.example.Words -- Word: qui, with odd character count: 3
08:09:47.137 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, Character count: 13
08:09:47.137 [sbt-bg-threads-1] INFO com.example.Words -- Word: reprehenderit, with odd character count: 13
08:09:47.137 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, Character count: 5
08:09:47.137 [sbt-bg-threads-1] INFO com.example.Words -- Word: Lorem, with odd character count: 5
08:09:47.138 [sbt-bg-threads-1] INFO com.example.Words -- Word: et, Character count: 2
08:09:47.138 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, Character count: 9
08:09:47.138 [sbt-bg-threads-1] INFO com.example.Words -- Word: excepteur, with odd character count: 9
08:09:47.138 [sbt-bg-threads-1] INFO com.example.Words -- Word: incididunt, Character count: 10
08:09:47.138 [sbt-bg-threads-1] INFO com.example.Words -- Word: id, Character count: 2
08:09:47.138 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, Character count: 11
08:09:47.139 [sbt-bg-threads-1] INFO com.example.Words -- Word: consectetur, with odd character count: 11
08:09:47.139 [sbt-bg-threads-1] INFO com.example.Words -- Word: eu, Character count: 2
08:09:47.139 [sbt-bg-threads-1] INFO com.example.Words -- Word: deserunt, Character count: 8
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (est,3)
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (qui,3)
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Sit,3)
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (minim,5)
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Irure,5)
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (magna,5)
08:09:47.140 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (velit,5)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (ipsum,5)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (Lorem,5)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (culpa,5)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (aliquip,7)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (laboris,7)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (excepteur,9)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (consectetur,11)
08:09:47.141 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (adipisicing,11)
08:09:47.142 [sbt-bg-threads-1] INFO com.example.Words -- Odd character words sorted in ascending order: (reprehenderit,13)
[success] Total time: 1 s, completed Sep 10, 2024, 8:09:47 AM
</pre>
