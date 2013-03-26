;
; find the sum of all multiples of 3 or 5 below 1000
;
(ns twproblem1
)

(defn multipleOf? [number divisor]
  (= 0 (mod number divisor )))

; Passing in a sequence to make it easier to test!
(defn sumMultipleOf3And5 [values] 
     (reduce + 
             (filter 
               #(or (multipleOf? % 3) (multipleOf? % 5)) 
                values
             )
     )
)

