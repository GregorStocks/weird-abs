(ns weird-abs.core
  (:gen-class))

(defn -main
  [& args]
  (println  (Math/abs -10000000000000) (Math/abs (read-string "-10000000000000"))))
