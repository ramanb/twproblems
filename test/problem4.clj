(ns twproblem4
  (:use clojure.test))


; Test the canonical case that has been provided in test data
(deftest testWith10
  (is (= 2520 (smallestMultiple modrange2) )))

; The case below requires some optimisation .. it is slow!
; note that it does NOT run out of heap.
;(deftest testWith20
;  (is (= 232792560 (divideBy modrange3) )))
