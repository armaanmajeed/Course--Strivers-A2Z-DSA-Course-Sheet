// Implementing Bubble Sort

for (let i = n - 1; i > 0; i--) {
    let didSwap = 0;
    for (let j = 0; j < i; j++) {
        if (arr[j] > arr[j + 1]) {
            let temp = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = temp;
            didSwap = 1;
        }
    }
    if (didSwap == 0) {
        break;
    }
}

/*  Time Complexity
        Best Case = O(n)
        Worst Case & Average Case = O(n^2)
*/