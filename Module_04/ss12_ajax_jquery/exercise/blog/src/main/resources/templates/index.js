/**
 * @param {*} page
 * @param {*} append
 */
function loadProducts(page, append) {
}

$.ajax({
    type: "GET", // HTTP Method
    url: 'http://localhost:8080/rest/products?page=${page ? page:""}',
    headers: {},
    "Content-Type": "application/json",
    success: function (data) { // callback xử lý khi request thành công renderProducts (data.content, append);
        renderProducts(data.content, append)
        renderLoadMoreButton(data);
    },
    error: function (error) { // callback xử lý khi request thất bại console.log(error);
        console.log(error);
    },
});
/**
 * Mục đích của đoạn code này là chờ cho document sẵn sàng rồi mới thực hiện phần code bên trong callback * (lấy dữ liệu sản phẩm)
 */
$(document).ready(function () {
    LoadProducts();
});

/**
 * @param {*} nextPage
 */
function loadMore(nextPage) {
    LoadProducts(nextPage, true);
}

/**
 * Mục đích dùng để kiểm tra điều kiện và render nút Load More
 * @param {*} productPageData
 */
function renderLoadMoreButton(productPageData) {
    if (productPageData.number < productPageData.totalPages - 1) {
        $("#LoadMoreContainer").html(
            `
    <button type="button" class="btn btn-secondary" 
    onclick="loadMore(${productPageData.number + 1})">Load More</button>
    `
        );
    } else {
        /*
        * Nếu lấy hết page rồi thì xoá nút Load More, không cho hiển thị trên browser nữa. * Tránh người dùng thao tác bấm nút mà ko còn dữ liệu để lấy.
        */
        $("#LoadMoreContainer").remove();
    }
}

/**
 * @param {x} products: Dah sách sản phẩm cần được render lên browser
 * @param {*} append: nếu là true thì dữ liệu sản phẩm sẽ được append tiếp vào danh sách sản phẩm hiện tại, false sẽ ngược lại
 */
function renderProducts(products, append) {
    let elements = "";
    for (let product of products) {
        // ở đây anh đang sử dụng để thao tác với chuỗi multiple Lines
        elements += `
    <div class="card col-sm-3">
    <img src="${product.thumbnail_url}" class="card-img-top" alt="..."> <div class="card-body">
    <h5 class="card-title">${product.name}</h5>
    <p class="card-text">${product.price}</p>
    <a href="#" class="btn btn-primary">Add Cart</a>
    </div>
    </div>
    `;
    }
    // Nếu append = true = sử dụng .append
    if (append) {
        $("#listProducts").append(elements);
    } else {
        // Nếu append = false = sử dụng .html ghi đè lại danh sách sản phẩm hiện tại được hiển thị trên browser
        $("#listProducts").html(elements);
    }
}