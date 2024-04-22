import { useQuery } from '@tanstack/react-query';
import { taskService } from '../api/api';

export function useTasks() {
	return useQuery({
		queryKey: ['tasks'],
		queryFn: () => taskService.getAll(),
		select: ({ data }) => data,
	});
}
