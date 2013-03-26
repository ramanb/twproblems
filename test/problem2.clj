(ns twproblem2
  (:use clojure.test))

; Test the canonical case that has been provided in test data
(deftest testTo10
  (is (= 10 (isEvenFibonacci 10) )))

(deftest testTo20
  (is (= 4613732 (isEvenFibonacci 4000000) )))