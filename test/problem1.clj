(ns twproblem1
      (:use clojure.test))

; Test the canonical case that has been provided in test data

(deftest testTo10
  (is (= 23 (sumMultipleOf3And5 (range 1 10)))))

; Test a degenerate case
(deftest testEmpty
  (is (= 0 (sumMultipleOf3And5 [] ))))
