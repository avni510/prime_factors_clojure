(ns prime_factors.core-spec
  (:require [speclj.core :refer :all]
            [prime_factors.core :refer :all]))

(describe "Prime Factors"
  (it "factors 1"
    (should= '() (prime-factors 1)))

  (it "factors 2"
    (should= '(2) (prime-factors 2)))

  (it "factors 3"
    (should= '(3) (prime-factors 3)))

  (it "factors 4"
    (should= '(2 2) (prime-factors 4)))

  (it "factors 5"
    (should= '(5) (prime-factors 5)))

  (it "factors 6"
    (should= '(2 3) (prime-factors 6)))

  (it "factors 7"
    (should= '(7) (prime-factors 7)))

  (it "factors 8"
    (should= '(2 2 2) (prime-factors 8)))

  (it "factors 9"
    (should= '(3 3) (prime-factors 9)))
          )
