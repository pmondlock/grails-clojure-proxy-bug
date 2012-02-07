(ns test)
(prn (-> (proxy [java.lang.Object] [] (toString [] "STRING"))))
