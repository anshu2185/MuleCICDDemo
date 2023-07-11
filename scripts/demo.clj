(ns clojure.examples.hello
   (:gen-class))

;; Description: This program displays Hello World
;; Script Name: Clojure Hello World
(defn Example []
   (def string1 (slurp "Example.txt"))
   (println string1))
(Example)
