```mermaid
flowchart TD
    A([Inicio]) --> B[/Ingresar producto/]
    B --> C[/Ingresar valor de la compra/]
    C --> D{compra >= 500000?}
    D -- Sí --> E[descuento = 20]
    D -- No --> F{compra >= 300000?}
    F -- Sí --> G[descuento = 15]
    F -- No --> H{compra >= 100000?}
    H -- Sí --> I[descuento = 10]
    H -- No --> J[descuento = 0]
    E --> K
    G --> K
    I --> K
    J --> K
    K[valorDescuento = compra * descuento / 100] --> L[subtotal = compra - valorDescuento]
    L --> M[iva = subtotal * 0.19]
    M --> N[total = subtotal + iva]
    N --> O[/Mostrar producto, descuento, subtotal, IVA y total/]
    O --> P([Fin])