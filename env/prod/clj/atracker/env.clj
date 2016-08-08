(ns atracker.env
  (:require [clojure.tools.logging :as log]))

(def defaults
  {:init
   (fn []
     (log/info "\n-=[atracker started successfully]=-"))
   :stop
   (fn []
     (log/info "\n-=[atracker has shut down successfully]=-"))
   :middleware identity})
