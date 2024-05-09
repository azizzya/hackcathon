import axios from 'axios';
import { getUserDataFromLocalStorage } from '../helpers/localStorage.helper';

const instance = axios.create({
	baseURL: 'http://localhost:8080/api/v01/',
});

instance.interceptors.request.use(
	config => {
		const userData = getUserDataFromLocalStorage();
		if (userData) {
			const { Username, Password } = userData;
			const base64Credentials = btoa(`${Username}:${Password}`);
			config.headers.Authorization = `Basic ${base64Credentials}`;
		}
		return config;
	},
	error => {
		return Promise.reject(error);
	}
);

export default instance;
