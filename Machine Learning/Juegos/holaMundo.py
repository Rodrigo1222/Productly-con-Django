import pandas as p
data_juego = p.read_csv("juegos-ml.csv")
X= data_juego.drop(columns="juegos")
y = data_juego["juegos"]
y