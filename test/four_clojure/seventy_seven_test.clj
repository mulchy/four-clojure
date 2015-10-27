(ns four-clojure.seventy-seven-test
  (:require [expectations :refer [expect]]
            [four-clojure.seventy-seven :refer :all]))

(expect
 #{#{"meat" "team" "mate"}}
 (collect-anagrams ["meat" "mat" "team" "mate" "eat"]))

(expect
 #{#{"veer" "ever"} #{"lake" "kale"} #{"mite" "item"}}
 (collect-anagrams ["veer" "lake" "item" "kale" "mite" "ever"]))
