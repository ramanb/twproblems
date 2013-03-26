;
; Largest Palindrome of 3 digits
;

(ns twproblem3)

(def gen2 (range 10 99))
(def gen3 (range 100 999))

(defn isPalindrome [number ndigits]
  (let [x (split-at ndigits (str number))]
       (= (nth x 0) (reverse(nth x 1))) 
  ) 
)


(defn largestPalindrome  [ndigits digits] 
      (last 
        (sort 
          (filter #(isPalindrome % ndigits) 
            (for [x digits y digits] (* x y))
          )
        )
      )  
)




  
  
  
  




