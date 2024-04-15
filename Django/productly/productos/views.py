<<<<<<< HEAD
from django.http import HttpResponse, HttpResponseRedirect
from django.shortcuts import render, get_object_or_404

from productos.forms import ProductoForm
from .models import Producto
# Create your views here.
def index(request):
    productos = Producto.objects.all().all()
    return render(request, 'index.html', context={'productos': productos})

def detalle(request, producto_id):
    producto = get_object_or_404(Producto, id= producto_id)

    return render(request, 'detalle.html', context={ 'producto': producto})

def formulario(request):
    if request.method == 'POST':
        form = ProductoForm(request.POST)
        if form.is_valid():
            form.save()
            return HttpResponseRedirect('/productos')
    else:
        form = ProductoForm()

=======
from django.http import HttpResponse, HttpResponseRedirect
from django.shortcuts import render, get_object_or_404

from productos.forms import ProductoForm
from .models import Producto
# Create your views here.
def index(request):
    productos = Producto.objects.all().all()
    return render(request, 'index.html', context={'productos': productos})

def detalle(request, producto_id):
    producto = get_object_or_404(Producto, id= producto_id)

    return render(request, 'detalle.html', context={ 'producto': producto})

def formulario(request):
    if request.method == 'POST':
        form = ProductoForm(request.POST)
        if form.is_valid():
            form.save()
            return HttpResponseRedirect('/productos')
    else:
        form = ProductoForm()

>>>>>>> b7cb822dfda0ffac4f10db6cf43110db479e69b3
    return render(request, 'producto_form.html', {'form': form})