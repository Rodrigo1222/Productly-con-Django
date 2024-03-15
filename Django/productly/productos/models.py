from django.db import models
from django.utils import timezone

# Create your models here.
class Categoria(models.Model):
    nombre = models.CharField(max_length=150)

class Producto(models.Model):
    nombre = models.CharField(max_length=150)
    stock  = models.IntegerField()
    puntaje = models.FloatField()
    Categoria = models.ForeignKey(Categoria, on_delete=models.CASCADE) 

creado_en = models.DateTimeField(default=timezone.now)
