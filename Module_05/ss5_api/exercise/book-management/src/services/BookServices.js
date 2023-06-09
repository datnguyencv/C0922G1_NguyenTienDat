import axios from "axios";

export const getAll  = async () => {
    try {
        const result = await axios.get('https://my-json-server.typicode.com/codegym-vn/mock-api-books/books')
        return result.data
    } catch (error) {
        console.log(error)
    }
}
export const create  = async () => {
    try {
        await axios.post('https://my-json-server.typicode.com/codegym-vn/mock-api-books/books')
    } catch (error) {
        console.log(error)
    }
}