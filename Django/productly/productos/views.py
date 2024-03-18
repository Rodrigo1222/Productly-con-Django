from django.shortcuts import render
from django.http import HttpResponse
from .models import Producto



# Create your views here.


def index(request):
    Productos = Producto.objects.all()

    return render(
        request, 
        "index.html",
        context={"productos": Productos}        
    )