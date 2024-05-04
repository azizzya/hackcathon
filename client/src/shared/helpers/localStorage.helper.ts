export function getTokenFromLocalStorage(): string {
	let data = localStorage.getItem('accessToken');
	data = data ? data : localStorage.getItem('refreshToken');
	const token = data ? JSON.parse(data) : '';

	return token;
}

export function setTokensToLocalStorage(
	accessToken: string,
	refreshToken: string
): void {
	if (
		localStorage.getItem('accessToken') ||
		localStorage.getItem('refreshToken')
	) {
		localStorage.removeItem('accessToken');
		localStorage.removeItem('refreshToken');
	}

	localStorage.setItem('accessToken', JSON.stringify(accessToken));
	localStorage.setItem('refreshToken', JSON.stringify(refreshToken));
}

export function removeTokensFromLocalStorage(): void {
	localStorage.removeItem('accessToken');
	localStorage.removeItem('refreshToken');
}

//возможно тут что-то поменяется
