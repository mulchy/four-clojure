(ns four-clojure.sixty-seven)

(defn next-prime [prev-primes]
  (loop [n (inc (last prev-primes))]
    (if (every? identity (map  #(not (= 0 (mod n %))) prev-primes))
      n
      (recur (inc n)))))

(defn seq-next-prime [prev-primes]
  (conj prev-primes (next-prime prev-primes)))

(defn first-n-primes [n]
  (cond
    (< n 1) []
    (= n 1) [2]
    (= n 2) [2 3]
    :else (nth (iterate seq-next-prime [2 3]) (-  n 2))))


;; from core lib examples, stack overflows for large n
(defn sieve [s]
  (cons (first s)
        (lazy-seq (sieve (filter #(not= 0 (mod % (first s)))
                                 (rest s))))))


(defn other-first-n-primes [n]
  (take n (sieve (iterate inc 2))))

;; see https://www.cs.hmc.edu/~oneill/papers/Sieve-JFP.pdf for more info
