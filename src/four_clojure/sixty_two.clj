(ns four-clojure.sixty-two)

(defn my-iterate [f x]
  (lazy-seq (cons x (my-iterate f (f x)))))
