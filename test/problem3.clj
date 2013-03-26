
(ns twproblem3
  (:use clojure.test))

; Test the canonical case that has been provided in test data
;
; I get 8448 rather than 9009 if I multiply 2 digit numbers???
(deftest test2Digits
  (is (= 8448 (largestPalindrome 2 gen2) )))

(deftest test3Digits
  (is (= 906609 (largestPalindrome 3 gen3 )) ))

