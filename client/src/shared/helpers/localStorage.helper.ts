// export function getTokenFromLocalStorage(): string {
// 	let data = localStorage.getItem('accessToken');
// 	data = data ? data : localStorage.getItem('refreshToken');
// 	const token = data ? JSON.parse(data) : '';

// 	return token;
// }

// export function setTokensToLocalStorage(
// 	accessToken: string,
// 	refreshToken: string
// ): void {
// 	if (
// 		localStorage.getItem('accessToken') ||
// 		localStorage.getItem('refreshToken')
// 	) {
// 		localStorage.removeItem('accessToken');
// 		localStorage.removeItem('refreshToken');
// 	}

// 	localStorage.setItem('accessToken', JSON.stringify(accessToken));
// 	localStorage.setItem('refreshToken', JSON.stringify(refreshToken));
// }

// export function removeTokensFromLocalStorage(): void {
// 	localStorage.removeItem('accessToken');
// 	localStorage.removeItem('refreshToken');
// }

export function getUserDataFromLocalStorage(): {
	Username: string;
	Password: string;
} {
	let data = localStorage.getItem('userData');
	const userData = data ? JSON.parse(data) : '';

	return userData;
}

export function setUserDataToLocalStorage(
	userPassword: string,
	userLogin: string
): void {
	if (localStorage.getItem('userData')) {
		localStorage.removeItem('userData');
	}

	localStorage.setItem(
		'userData',
		JSON.stringify({ Password: userPassword, Username: userLogin })
	);
}

export function removeUserDataFromLocalStorage(): void {
	localStorage.removeItem('userData');
}
