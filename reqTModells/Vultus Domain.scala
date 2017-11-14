Model(Domain("Vultus") is
(System("SataliteDataSystem") interactsWith System("VultusEngine"), System("FarmManagementSystem") interactsWith System("VultusEngine"), System("AnomalyDetection") interactsWith
(User("User"), System("VultusEngine")), System("VultusEngine") interactsWith
(System("FarmManagementSystem"), System("AnomalyDetection"), System("SataliteDataSystem")), User("User") interactsWith
(System("FarmManagementSystem") has Input("UserDefinedArea"), System("AnomalyDetection") has Output("AnomalyVisualization"))))