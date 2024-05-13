import { taskService } from '@/shared/api/task.service';
import { useQuery } from '@tanstack/react-query';

export function useTasks() {
	return useQuery({
		queryKey: ['tasks'],
		queryFn: () => taskService.getAll(),
		select: ({ data }) => data,
	});
}
