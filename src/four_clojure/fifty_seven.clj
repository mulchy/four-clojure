(ns four-clojure.fifty-seven)

(defn my-comp
  "compose n functions"
  ([] identity)
  ([f] f)
  ([f g]
   (fn
     ([] (f (g)))
     ([x & args] (f (apply g (list* x args))))))
  ([f g & more]
   (reduce comp f (list* g more))))
