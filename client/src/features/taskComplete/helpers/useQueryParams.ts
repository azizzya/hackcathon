import { useLocation } from 'react-router-dom';

export function useQueryParams(): string {
	const location = useLocation();
	const queryParams = new URLSearchParams(location.search);
	const paramValue = queryParams.get('task_id');

	if (!paramValue) return '';

	return paramValue;
}
