(ns prime_factors.core)

(defn prime-factors [n]
  (loop [num-to-be-factored n factors '() divisor 2]
  (if (< num-to-be-factored 2)
    (sort factors)
    (if (zero? (mod num-to-be-factored divisor))
      (recur (/ num-to-be-factored divisor ) (conj factors divisor) divisor)
      (recur num-to-be-factored factors (inc divisor))
))))

