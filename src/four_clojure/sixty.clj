(ns four-clojure.sixty)

(defn my-reductions
  ([f coll]
   (my-reductions f (first coll) (rest coll)))
  ([f init coll]
   (if (empty? coll)
     [init]
     (cons init
           (lazy-seq (my-reductions
                      f
                      (f init (first coll))
                      (rest coll)))))))
