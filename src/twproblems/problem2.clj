; Consider the terms in the Fibonacci series whose values do not exceed
; 4 million and find the sum of the even-valued terms
;
;
(ns twproblem2)
;
; fibonacci .. sum the previous two terms
;
(defn fib [[n m]] [m (+ n m)])

; Could not use nested filters here .. 
(defn isEvenFibonacci [value] 
  (reduce + 
        (take-while #(< % value) 
                     (filter even? 
                             (map first 
                                  (iterate fib [0 1])
                              )
                      )
        )
  )
)




