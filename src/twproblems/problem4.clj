;
; What is the smallest positive number that is evenly divisible by
; all of the numbers from 1 to 20
;
; This solution is quite slow..

(ns twproblem4)


(def modrange2 (range 2 10))
(def modrange3 (range 2 20))


(defn isDivisible [n modrange ]
  (= (count (filter #(= % 0)(for [m modrange ] (mod n m)))) (count modrange))
)

(defn smallestMultiple [modrange]
    (first (drop-while #(not(isDivisible % modrange)) (iterate inc 1)))
)
